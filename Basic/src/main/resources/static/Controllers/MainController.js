var nameApp = angular.module('PerformanceTestApp', []);
nameApp.controller('MainController', function ($scope,$http){
    $scope.api;

    $scope.getRequest = function() {
        var url = "http://localhost:8880/test";

        $http.get(url)
        .then(function(returnedJson) {
            $scope.api=JSON.parse(JSON.stringify(returnedJson.data));
        })
        .catch(console.error)
    };

});