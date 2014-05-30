module.exports = {
	setSystemVolume: function(volume) {
		cordova.exec(null, null, "SytemVolume", "setSystemVolume", [volume]);
	}
};
