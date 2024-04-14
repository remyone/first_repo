// Import required modules
var express = require('express');
var path = require('path');
var bodyParser = require('body-parser');
var expressSession = require('express-session');
var cookieParser = require('cookie-parser');

// Create an Express app
var app = express();

// Middleware
app.use(cookieParser());
app.use(expressSession({
    secret:'<some-secret-token-here>',
    resave: true, 
    saveUninitialized: true
}));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, 'public')));

// Error Handler for 404 Pages
app.use(function(req, res, next) {
    var error404 = new Error('Route Not Found');
    error404.status = 404;
    next(error404);
});

// Export the app for use in the Java code
exports = module.exports = app;

// Start the server
app.listen(9000, function(){
    console.log('Example app listening on port 9000!')
});