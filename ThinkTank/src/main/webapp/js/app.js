angular.module('project', [ 'ngSanitize', 'ngRoute', 'ngResource', 'mgcrea.ngStrap' ])
.config(function($routeProvider) {
	$routeProvider.when('/', {
		controller : 'HomeCtrl',
		templateUrl : 'view/home.html'
	})
	.otherwise({
		redirectTo : '/'
	});
})
.controller('HomeCtrl', function($scope) {
	$scope.message="hello";
})


