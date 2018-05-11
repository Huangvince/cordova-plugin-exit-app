var exec = require('cordova/exec');

exports.exitApp = function (arg0, success, error) {
    exec(success, error, 'exitapp', 'exitApp', [arg0]);
};
