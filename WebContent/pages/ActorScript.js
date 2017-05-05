function SearchActorController($scope, $http)
{
	$scope.fname;
	$scope.actors=[];
	$scope.ActorFName;
	$scope.ActorLName;
	$scope.ActorDob;
	$scope.ActorImage;

	$scope.searchActor= function() 
	{
		$http.get('http://localhost:9999/FMSLa/ServletForSearchActorUsingName'+'?name='+$scope.fname).success(function (data) {
			console.log("Received");
			$scope.status=data;
			$scope.actors = data;
			$scope.ActorFName="First Name";
			$scope.ActorLName="Last Name";
			$scope.ActorDob="Date Of Birth";
			$scope.ActorImage="Actor Image";
			
		});
	};
}
function UserController($scope, $http)
{
	$scope.actor = {};

	$scope.createActor = function() 
	{
		$scope.datepattern="YYYY-MM-DD";
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/ServletForAddActor',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.actor
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}


function RemoveActorController($scope, $http)
{
	$scope.actor = {};

	$scope.RemoveActor = function() 
	{
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/ServletForRemoveActor',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.actor
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}

function UpdateActorController($scope, $http)
{
	$scope.actor = {};

	$scope.UpdateActor = function() 
	{
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/ServletForUpdateActor',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.actor
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}

function GetActorController($scope, $http)
{
	
	$scope.fname;
	$scope.actors=[];
	
	$scope.ActorFName;
	$scope.ActorLName;
	$scope.ActorDob;
	$scope.ActorImage;

	$scope.GetActor= function() 
	{
		

		$http.get('http://localhost:9999/FMSLa/ServletForSearchActorUsingName'+'?name='+$scope.fname).success(function (data) {
			console.log("Received");
			$scope.status=data;
			$scope.actors = data;
			$scope.ActorFName="First Name";
			$scope.ActorLName="Last Name";
			$scope.ActorDob="Date Of Birth";
			$scope.ActorImage="Actor Image";
			
		});
	};
}
