## Exercise I - Menu Code Kata

### Design & Testing Consideration. 

The design of Menu Features follows the standard SOLID Principle. Classes are seperated based on their individual responsibity and which are open for extension as well. Followed the composition over inheritence principle so that changes in the base class should not effect the sub classes. High degree of testability is achieved.The code is well versed with Error Handling.

***Classes and Responsibilities*** 

All the below class implements the Interface corresponding to their functionality assigned. 

1-**SelectedRecipeItemClass**

    - Able to mark a single recipe as selected.
    - Able to mark multiple recipes as selected.
    - Able to mark the recipes with tag as selected.
   
   **Restricting the behavior**

    - You should not be able to select more than 3 recipes.

  **Modifying the behavior based on subscription type**

    - You should be able to select up to 5 recipes if the subscription is for a family.

2-**UnSelectedRecipeItemClass**

    - Able to unselect a single selected recipe.
    - Able to unselect multiple selected recipes.

3-**AccessItemsListClass** 

    - You should be able to request a list of selected recipes.
    - You should be able to request a list of recipes which have a certain tag.

4-**MenuCard**

    - A list of recipes available for selection is provided to the menu. 
    - Menu exposes a list of recipes available for selection.
    - Menu has a reference to an associated subscription.
    
5-**MenuCardException**

    - Handles the Exception thrown from different classes.
    

***Testing Strategy***

  Junit & Integration is achieved at a very high degree through following the above design approach.

## 📷 Screenshots
<img src ="./classdiagram/Class_Diagram_Final.png" width="260" />
<img src ="./classdiagram/TestCoverageReport.PNG" width="260" />

 
## Exercise II -  Recipes List View 

## Recipes List Application
A simple single-page application showcasing the list of recipes.
A sample application to demonstrate how to use Jetpack Architecture Components in an Android Application following the Clean MVVM Architecture concepts.

### Design & Testing Consideration. 

MVVM android design pattern with Clean Architecture separates your view (i.e. Activitys and Fragments) from your business logic.It goes one step further in separating the responsibilities of your code base. It clearly abstracts the logic of the actions that can be performed in your app.

Advantages of Using MVVM with  Clean Architecture

    1-Your code is even more easily testable as the code base is divided into Presentation layer , Domain(Use Case) layer and Data Layer.
    2-Your code is further decoupled (the biggest advantage.)
    3-The package structure is even easier to navigate.
    4-The project is even easier to maintain.
    5-Your team can add new features even more quickly.
    
Testing Strategy 

Points

    1-Test as much we can like Utils class and other small class which can be easily testable.
    2-Focus more on Junit testing then Integration or End to End Testing.
    3-Architecture your application is such a way that maximum testablity can be achieved.
    4-Set a code coverage base limit (example 60% ) for your application and try to increase it further.

Use tools like Essperso, Mockito etcs .

Below are the image taken from Udacity Nano degree Program where I have learned the testing strategy.

## 📷 Screenshots for testing stratery <Images Credit goes to Udacity Nano degree Program>
 
<img src ="./classdiagram/unittest.PNG" width="260" />
<img src ="./classdiagram/integration.PNG" width="260"/>
<img src ="./classdiagram/endtoend.PNG" width="260" />


  
## ⚙ Tech used
- Recipe Api
- Kotlin
- Model-View-Viewmodel Architecture
- Navigation component
- Retrofit 2
- GSON
- Moshi
- Kotlin Courtines.
- Glide.
- Data-Binding.
- Piccasso

This app demonstrates the following views and techniques from the below documentation.

* [Retrofit](https://square.github.io/retrofit/) to make api calls to an HTTP web service.
* [Moshi](https://github.com/square/moshi) which handles the deserialization of the returned JSON to Kotlin data objects. 
* [Glide](https://bumptech.github.io/glide/) to load and cache images by URL.

  
It leverages the following components from the Jetpack library:

* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
* [Data Binding](https://developer.android.com/topic/libraries/data-binding/) with binding adapters
* [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/) with the SafeArgs plugin for parameter passing between fragments



## 🚀 Features & Suggested Workflow Completed.

- The app should show a single view.
- At launch, the app should show a loading spinner while it gets the data from the source. 
- When the data is fetched, the app should hide the loading spinner and show the recipes’ view.
- Show the current date in “dd  MMM” format (20 Aug) with text size 18sp as a first element of the recipes list view.
- Recipes in the list are presented as cards with image, title and headline. Title should be in bold with text size 16sp.
- If an error occurred, you should show a snackbar with a short description of the issue.



## 📷 Screenshots
<img src ="./classdiagram/Screenshot_1635081409.png" width="260" />
<img src ="./classdiagram/Screenshot_1635081420.png" width="260" />
<img src ="./classdiagram/Screenshot_1635081424.png" width="260" />
<img src ="./classdiagram/Screenshot_1635081446.png" width="260" />
<img src ="./classdiagram/Screenshot_1635081446.png" width="260" />


## 🎯 Requirements
- Android 5.0 and Above
- Min sdk version 21

## 💻 Permissions
- Internet

