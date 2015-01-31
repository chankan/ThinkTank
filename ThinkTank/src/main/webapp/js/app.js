function getMap() {
	var mapOptions = {
		center : {
			lat : -34.397,
			lng : 150.644
		},
		zoom : 15
	};
	var map = new google.maps.Map(document.getElementById('map-canvas'),
			mapOptions);
	return map;
}

angular.module('project', [ 'ngSanitize', 'ngRoute', 'ngResource', 'mgcrea.ngStrap' ])
.factory('TicketRes',[ '$resource', function($resource) {
	var service = $resource('rest/service/ticket');
	return service;
	} ])
.config(function($routeProvider) {
	$routeProvider
	.when('/', {
		controller : 'HomeCtrl',
		templateUrl : 'view/home.html'
	})
	.when('/ticketlist', {
		controller : 'TicketListCtrl',
		templateUrl : 'view/ticketList.html'
	})
	.when('/ticket/:ticketId', {
		controller : 'TicketCtrl',
		templateUrl : 'view/ticket.html'
	})
	.when('/donarsearch', {
		controller : 'SearchCtrl',
		templateUrl : 'view/donorsearch.html'
	})
	.otherwise({
		redirectTo : '/'
	});
})
.controller('HomeCtrl', function($scope) {
	$scope.message="hello";
})
.controller('TicketListCtrl', function($scope, TicketRes) {
	$scope.get=function(){
		TicketRes.get({},function(response){if(response){if(Array.isArray(response.donationTicketDetails)){ $scope.ticketData=response.donationTicketDetails;}else{$scope.ticketData=[response.donationTicketDetails];}}}, function(){$scope.ticketData=[];});
	};
	$scope.get();
})
.controller('TicketCtrl', function($scope, $routeParams) {
	var ticketId = $routeParams.ticketId;
})
.controller('SearchCtrl', function($scope, $routeParams) {
	var map=getMap();
})


