
![Screenshot 2023-11-16 181928](https://github.com/RAJA-072/Exam-Scheduling-app/assets/143001262/7671328a-239a-4f3b-be0e-ccb533a2e4f8)
![Screenshot 2023-11-16 181944](https://github.com/RAJA-072/Exam-Scheduling-app/assets/143001262/3ae58b41-cd2f-4bd4-94fd-21ed7f528d25)
![Screenshot 2023-11-16 181958](https://github.com/RAJA-072/Exam-Scheduling-app/assets/143001262/c9a5c865-1984-47ac-b43e-58fbbb76e555)


# ajarajeswari_r_s_application37

Built with AndroidX Support

Requires Android Studio Arctic Fox | 2020.3.1 or higher.

Current Kotlin Version 1.7.20


### SDK Versions

compileSdkVersion 33

buildToolsVersion "30.0.3"

minSdkVersion 23

targetSdkVersion 33


### Libraries

1. Retrofit- REST API Call
https://square.github.io/retrofit/
2. Glide - Image Loading and caching.
https://github.com/bumptech/glide
3. Material Design Components - Google's latest Material Components.
https://material.io/develop/android
4. koin - Dependency Injection
https://insert-koin.io/

### Figma design guideline for better accuracy

Read our guidelines to increase the accuracy of design conversion to code by optimizing Figma designs. 
https://docs.dhiwise.com/docs/Designguidelines/intro .

### App Navigation

Check your app\'s UI from the AppNavigation screens of your app.

### Package Structure


```
├── appcomponents       
│ ├── di                 - Dependency Injection Components 
│ │ └── MyApp.kt
│ ├── network            - REST API Call setup
│ │ ├── ResponseCode.kt
│ │ └── RetrofitProvider.kt
│ └── ui                 - Data Binding Utilities
│     └── CustomBindingAdapter.kt
├── constants            - Constant Files
│ ├── IntegerConstants.kt
│ └── StringConstants.kt
├── extensions           - Kotlin Extension Function Files
│ └── Strings.kt
├── modules              - Application Specific code
│ └── example            - A module of Application 
│  ├── ui                - UI handling classes
│  └── data              - Data Handling classes
│    ├── viewmodel       - ViewModels for the UI
│    └── model           - Model for the UI
└── network              - REST API setup
  ├── models             - Request/Response Models
  ├── repository         - Network repository
  ├── resources          - Common classes for API
  └── RetrofitService.kt
```
