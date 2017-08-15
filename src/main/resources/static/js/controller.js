var app = angular.module('app', []);

app.controller('postcontroller', function($scope, $http,$location){
	$scope.submitForm = function(){
		var url = $location.absUrl() + "tags/add/" + $scope.hashtag;
		
		var config={
				headers: {
					'Content-Type': 'application/json;charset=utf-8;'
				}
		}
	var data = {
		hashtag: $scope.hashtag
	};
	
	$http.post(url,data,config).then(function(response){
		$scope.postResultMessage = "Sucessful!";
	},function(response){
		$scope.postResultMessage = "Fail!";
	});
	
	$scope.hashtag = $scope.hashtag;
	}
		
});

app.controller('getcontroller',function($scope,$http, $location){
	$scope.getfunction = function(){
		var url = $location.absUrl() + "data";
		
		var config = {
				headers: {
					'Content-Type': 'application/json;charset=utf-8;'
				}
				
		}
				
		$http.get(url,config).then(function(response){
			$scope.response = response.data
		}, function(response){
			$scope.getResultMessage = "Fail!";
		
		});
	}
});

app.controller('deletecontroller',function($scope,$http, $location){
	$scope.deleteForm = function(){
		var url = $location.absUrl() + "data/delete/" + $scope.hashtagd;
		
		var config = {
				headers: {
					'Content-Type': 'application/json;charset=utf-8;'
				}
				
		}
		var data = {
				hashtagd: $scope.hashtagd
			};
		$http.delete(url,config).then(function(response){
			console.log(response.data);
		}, function(rejection){
			console.log(rejection.data);
		
		});
	}
});