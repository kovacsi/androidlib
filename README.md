# Test SDK for Android

[![Coverage Status](https://coveralls.io/repos/github/kovacsi/androidlib/badge.svg?branch=master)](https://coveralls.io/github/kovacsi/androidlib?branch=master)

## Overview

This document describes the Test SDK for the Android platform. The document describes the main Test Android SDK interface functions.

## Install

Minimum supported version is ***minSdkVersion 16***

- Add the SDK to your build.gradle
```
repositories {
    jcenter()
}
```
and 
```
compile 'com.blabla:bla:+'
```
- Implement in the application

## Getting started

The semantics of Test SDK.

## Sample Code

We <3 open source software, that’s why we open sourced our Test SDK for Android implementation.

## SDK Development

The following tasks may be useful during SDK development.

### Deploy to Maven Local
```sh
$ ./gradlew install
```

### Run Tests
```sh
$ ./gradlew cAT -i
```

### Generate JavaDoc
```sh
$ ./gradlew javaDoc
```
