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
	var service = $resource('rest/service/ticket/:ticketId',{ticketId: '@ticketId'});
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
	.when('/donorsearch/:ticketId', {
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
.controller('TicketCtrl', function($scope, $routeParams, TicketRes) {
	$scope.ticketId = $routeParams.ticketId;
	$scope.get=function(){
		TicketRes.get({ticketId:$scope.ticketId},function(response){if(response){$scope.ticket=response;}}, function(){$scope.ticket=null;});
	};
	$scope.get();	
})
.controller('SearchCtrl', function($scope, $routeParams, TicketRes) {
	$scope.map=getMap();
	$scope.ticketId = $routeParams.ticketId;
	$scope.get=function(){
		TicketRes.get({ticketId:$scope.ticketId},function(response){if(response){$scope.ticket=response;}}, function(){$scope.ticket=null;});
	};
	$scope.get();	
//	var myPopover = $popover(element, {title: 'My Title', content: 'My Content'});
//	myPopover.$show();
//	$scope.popover = {
//			  "title": "Title",
//			  "content": "Hello Popover<br />This is a multiline message!"
//			};
//	$scope.popover.$show();
})


