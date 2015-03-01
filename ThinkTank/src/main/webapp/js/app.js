function getMap() {
	var mapOptions = {
		center : {
			lat : 19.03902,
			lng : 72.86190
		},
		zoom : 14
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
	.factory('TicketRes1',[ '$resource', function($resource) {
		var service = $resource('rest/service/ticket');
		return service;
	} ])
	.factory('HospitalRes',[ '$resource', function($resource) {
		var service = $resource('rest/service/hospital/:id',{id:'@id'});
		return service;
	} ])
	.factory('DonorCenterRes',[ '$resource', function($resource) {
		var service = $resource('rest/service/donorCenter');
		return service;
	} ])
	.factory('DonorRes',[ '$resource', function($resource) {
		var service = $resource('rest/service/donor');
		return service;
	} ])
.config(function($routeProvider) {
	$routeProvider
	.when('/', {
		controller : 'HomeCtrl',
		templateUrl : 'view/home.html'
	})
	.when('/tickenew', {
		controller : 'TicketNewCtrl',
		templateUrl : 'view/tickeNew.html'
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
.controller('TicketNewCtrl', function($scope, TicketRes1) {
	$scope.ticket={ticketId:-1,ticketRaisedBy:"",ticketDetails:"",ticketSeverity:"Low",ticketStatus:"Open",comments:"New Request"};
	$scope.create=function(){
		TicketRes1.save($scope.ticket,function(response){if(response){alert("Ticket generated");}}, function(){alert("Ticket not generated");});
	};
//	$scope.get();
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
.controller('SearchCtrl', function($scope, $routeParams, TicketRes, DonorCenterRes, $select, DonorRes, HospitalRes) {
	$scope.map=getMap();	
	$scope.ticketId = $routeParams.ticketId;
	$scope.KmList=[{value: 1, label:"1 KM"},{value: 2, label:"2 KM"},{value: 3, label:"3 KM"},{value: 4, label:"4 KM"},{value: 5, label:"5 KM"},];
	$scope.get=function(){
		TicketRes.get({ticketId:$scope.ticketId},function(response){if(response){
			$scope.ticket=response;
			HospitalRes.get({id:1},function(response){if(response){$scope.hospital=response;}}, function(){$scope.hospital=null;});
			
		}}, function(){$scope.ticket=null;});
		DonorCenterRes.get({},function(response){if(response){if(Array.isArray(response.hospitalMaster)){ $scope.donorCenterList=response.hospitalMaster;}else{$scope.donorCenterList=[response.hospitalMaster];}}}, function(){$scope.donorCenterList=[];});
		DonorRes.get({},function(response){if(response){if(Array.isArray(response.donorDetailss)){ $scope.donorList=response.donorDetails;}else{$scope.donorList=response.donorDetails;}}}, function(){$scope.donorList=[];});
	};
	$scope.popover = {
			  "title": "Title",
			  "content": "Hello Popover<br />This is a multiline message!"
//			  "template": "view/ticket.html"
			};
	$scope.get();	
	$scope.message="SDFS";
	
	$scope.load=function(){
		
		
//		angular.forEach($scope.donorCenterList,function(value,key){if(value.hospitalId==$scope.selectedCenter){}})
//		$scope.selectedCenter;
		var marker = new google.maps.Marker({
			    position: new google.maps.LatLng( $scope.selectedCenter.mapLongitude, $scope.selectedCenter.mapLatitude),
			    map: $scope.map,
			    title: ($scope.selectedCenter.hospitalName+":"+$scope.selectedCenter.hospitalAddress)
			  });
//		
//		for(var i=0;i< 10;i++){
//		angular.forEach($scope.donorList, function(value,key){
//			var marker = new google.maps.Marker({
//			    position: new google.maps.LatLng( value.donorHomeMapLongitude, value.donorHomeMapLatitude),
//			    map: $scope.map,
//			    title: (value.donorName+":"+value.donorPrimaryNo)
//			  });
//		});

//		$scope.message=$scope.selectedCenter.mapLatitude;
		$scope.map.panTo(marker.getPosition());
	};
//	var myPopover = $popover(element, {title: 'My Title', content: 'My Content'});
//	myPopover.$show();
//	$scope.popover = {
//			  "title": "Title",
//			  "content": "Hello Popover<br />This is a multiline message!"
//			};
//	$scope.popover.$show();
})


