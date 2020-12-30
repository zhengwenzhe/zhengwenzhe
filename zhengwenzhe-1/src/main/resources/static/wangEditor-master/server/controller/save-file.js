/**
 * @description 保存上传的文件
 * @author wangfupeng
 */

const os = require('os')
const fs = require('fs')
const path = require('path')
const formidable = require('formidable')
const { objForEach } = require('../util')
const FILE_FOLDER = 'upload-files'
const isWindows = os.type().toLowerCase().indexOf('windows') >= 0
const TMP_FOLDER = 'upload-files-tmp'

/**
 * 保存上传的文件
 * @param {Object} req request
 */
function saveFiles(req) {
    return new Promise((resolve, reject) => {
        const imgLinks = []
        const form = formidable({ multiples: true })

        // windows 系统，处理 rename 报错
        if (isWindows) {
            const tmpPath = path.resolve(__dirname, '..', '..', TMP_FOLDER) // 在根目录下
            if (!fs.existsSync(tmpPath)) {
                fs.mkdirSync(tmpPath)
            }
            form.uploadDir = TMP_FOLDER
        }

        form.parse(req, function (err, fields, files) {
            if (err) {
                reject('formidable, form.parse err', err.stack)
            }
            // 存储图片的文件夹
            const storePath = path.resolve(__dirname, '..', FILE_FOLDER)
            if (!fs.existsSync(storePath)) {
                fs.mkdirSync(storePath)
            }

            // 遍历所有上传来的图片
            objForEach(files, (name, file) => {
                // 图片临时位置
                const tempFilePath = file.path
                // 图片名称和路径
                const fileName = file.name
                const fullFileName = path.join(storePath, fileName)
                // 将临时文件保存为正式文件
                fs.renameSync(tempFilePath, fullFileName)
                // 存储链接
                imgLinks.push(`/server/${FILE_FOLDER}/` + fileName)
            })

            // 返回结果
            resolve({
                errno: 0,
                data: imgLinks,
            })
        })
    })
}

module.exports = saveFiles
