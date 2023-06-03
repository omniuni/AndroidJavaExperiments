# Android Java Experiments

This is general information about the project.

# Android App For Learning Java

## Table Of Contents
* [About The Project](#about-the-project)
* [Built With](#built-with)
* [Installation And Setup](#installation-and-setup)
    - [Virtual Android Phone Setup](#virtual-android-phone-setup)
    - [Clone The Repository](#clone-the-repository)
    - [Running The App In Virtual Phone](#running-the-app-in-virtual-phone)
    - [Pulling And Committing Changes](#pulling-and-comitting-changes)

## About The Project
This project sets up Android Studio as an environment to learn Java code in an Android app.
This will give anyone who wants to learn Java a more interactive way to do so.

##### Experiments In This Project

## Built With
* Android Studio Flamingo | 2022.2.1

## Installation and Setup
Navigate to the [Android Studio](https://developer.android.com/studio) webpage and click the *Download Android Studio Flamingo* button. Accept the terms to the agreement that pops up and then click the download button. Once that installs, follow the steps detailed below to get the environment set up and ready to use.

You also may need to install Git if you don't have it. Navigate to the [Git](https://git-scm.com/downloads) download page and download and install Git for your system.

#### Virtual Android Phone Setup
In order to begin using this, you will need to set up your Android Virtual Phone. Follow these steps below to set up your virtual Android Phone:
1. Click Project View tab on the left > Go to Device Manager window on right > Click Create Device
2. Choose Phone Category > Pick Pixel 4a > Click Next
3. Click x86 images tab > Choose Android 11.0(Google APIs) > Click Next
4. Name your AVD > Startup Orientation Portrait > Click Enable Device Frame (which is a Personal Preference)
5. Click Finish
6. Run your Device to make sure it works (NOTE: May take some time to implement) > Under Actions > Launch this AVD in the Emulator (Play Button) 

#### Clone The Repository
Follow these steps to clone a repository from Github.
1. Click Git tab in top menu bar > Choose Clone
2. Put in your Repository URL > Walk through prompts
3. Click Clone button
   
Alternative steps to 2:
1. Login to Github on Android Studio and select the repository from the dropdown menu and then click clone.

#### Running The App In Virtual Phone
Once you have everything set up, you will then want to run the app to make sure everything is working correctly. Follow these steps below to do that:
1. Click Build in top menu bar > Choose Rebuild Project
2. Hit the Green Play button at the top right under the menu bar which is the "Run 'app'" button.

If it runs, then you have successfully set everything up! 

#### Pulling And Committing Changes
You will need to pull and commit any changes that are done within Android Studio/Github.

Follow these steps to pull changes:
1. Choose Git in top menu bar > Click Pull
2. git pull and origin should be in the boxes on the left
3. Choose the branch you want the changes from > Click Pull

Follow these steps to commit changes:
1. After making needed changes > Click Git in top menu bar > Choose Commit
2. Choose the files that you want to commit and add comments as needed
3. Click Commit and Push

#### Check Out A New Branch
To check out a branch to make changes, follow these steps:
1. Choose Git in top menu bar > Click Fetch
2. In the Git tab in the lower left window > Right Click the branch you want to checkout
3. Click Checkout in the menu