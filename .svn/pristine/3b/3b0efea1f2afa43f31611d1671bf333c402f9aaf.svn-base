

function SearchByReleaseYearController($scope, $http)
{
	$scope.rYear;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;

	$scope.createFilm = function() 
	{

		$http.get('http://localhost:9999/FMSLa/SearchByReleaseYearServlet'+'?sbr='+$scope.rYear).success(function (data) {

			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
		});


	};
}

function SearchByRatingController($scope, $http)
{
	$scope.rating;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;

	$scope.searchFilmByRating= function() 
	{
		/*$http({
        method: 'GET',
        url: ' http://localhost:9999/FMSLa/ServletForAddActor',
        headers: {'Content-Type': 'application/json'},
        data:  $scope.rYear
      }).success(function (data) 
        {
      	$scope.status=data;
        });*/

		$http.get('http://localhost:9999/FMSLa/SearchByRatingServlet'+'?sbr='+$scope.rating).success(function (data) {

			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
		});


	};


}

function SearchByCategoryController($scope, $http)
{
	$scope.catg;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;

	$scope.searchFilmByCategory= function() 
	{
		/*$http({
        method: 'GET',SearchByCategoryController
        url: ' http://localhost:9999/FMSLa/ServletForAddActor',
        headers: {'Content-Type': 'application/json'},
        data:  $scope.rYear
      }).success(function (data) 
        {
      	$scope.status=data;
        });*/

		$http.get('http://localhost:9999/FMSLa/ServletForSearchByCategory'+'?sbc='+$scope.catg).success(function (data) {

			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
		});


	};


}

function SearchByTitleController($scope, $http)
{
	$scope.actorList = [];
	$scope.title;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;
	$scope.ActorFName;

	$scope.searchFilmByTitle= function() 
	{
		/*$http({
        method: 'GET',SearchByCategoryController
        url: ' http://localhost:9999/FMSLa/ServletForAddActor',
        headers: {'Content-Type': 'application/json'},
        data:  $scope.rYear
      }).success(function (data) 
        {
      	$scope.status=data;
        });*/

		$http.get('http://localhost:9999/FMSLa/ServletForSearchByTitle'+'?sbt='+$scope.title).success(function (data) {

			
			
			
			
			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
			$scope.ActorFName="Actor Lists";
			
			
			
		});


	};


}

function SearchByLanguageController($scope, $http)
{
	$scope.actorList = [];
	$scope.lang;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;
	$scope.ActorFName;
	$scope.ActorImage;

	$scope.searchFilmByLanguage= function() 
	{
		

		$http.get('http://localhost:9999/FMSLa/ServletForSearchByLanguage'+'?sbl='+$scope.lang).success(function (data) {

			
			
			
			
			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
			$scope.ActorFName="Actor Lists";
			$scope.ActorImage="Image Of The Actor";
			$scope.CatName="Category Name";
			
		});
	};
}

function SearchByActorController($scope, $http)
{
	
	$scope.fname;
	$scope.lname;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;
	$scope.ActorFName;
	$scope.ActorImage;

	$scope.searchFilmByActor= function() 
	{
		

		$http.get('http://localhost:9999/FMSLa/SearchFilmByActorServlet'+'?sbafn='+$scope.fname+'&sbaln='+$scope.lname).success(function (data) {

			
			
			
			
			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
			$scope.ActorFName="Actor Lists";
			$scope.ActorImage="Image Of The Actor";
			$scope.CatName="Category Name";
			
			
			
			
			
			
			
			
		});
	};
}
function RemoveFilmController($scope, $http)
{
	$scope.film = {};

	$scope.RemoveFilm = function() 
	{
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/ServletForRemoveFilm',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.film
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}


function UpdateFilmController($scope, $http)
{
	$scope.film = {};

	$scope.UpdateFilm = function() 
	{
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/ServletForUpdateFilm',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.film
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}

function FilmController($scope, $http)
{
	$scope.film = {};

	$scope.createFilm = function() 
	{
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/AddFilmServlet',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.films
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}

function GetFilmController($scope, $http)
{
	$scope.rating;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;

	$scope.GetFilm= function() 
	{
		/*$http({
        method: 'GET',
        url: ' http://localhost:9999/FMSLa/ServletForAddActor',
        headers: {'Content-Type': 'application/json'},
        data:  $scope.rYear
      }).success(function (data) 
        {
      	$scope.status=data;
        });*/

		$http.get('http://localhost:9999/FMSLa/ServletForGetAllFilm').success(function (data) {

			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
		});


	};

}


