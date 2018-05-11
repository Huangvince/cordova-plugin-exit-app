var exec = require('cordova/exec');

exports.exitApp = function (arg0, success, error) {
    exec(success, error, 'exitAppPlugin', 'exitApp', [arg0]);
};
