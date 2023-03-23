# Widya-Travel
Widya Travel is a travel agency that provide travel booking service & car rental service using **android application** that covers orders from Central Java and its surroundings.

## About the Project
This is a software development project that is being carried out to fulfill assignments in the **Software Project** course. Our team is called **Andromeda** and consists of 4 people. Software development is carried out using the **Waterfall** method (Requirement Elicitation, Analysis & Design, Implementation, Testing), with each stage headed by 1 member.

I personally (Linggar Maretva Cendani) play the role of **Head of Implementation**, which is responsible for leading, guiding, and supervising all team members at the Implementation stage. Apart from that, I am in charge of doing most of the implementation stages, Setting-up each app on each platform (Android & Web), creating APIs, and integrating each app from different platforms into one complete project.

## Tech Stack
This project consist of 3 applications: 
* **`WidyaApps`** (**Native Android**, Developed using Android Studio): an android app used by **customers/ users** to make an order (book a travel shuttle or rental a car)
* **`WidyaDriver`** (**Native Android**, Developed using Android Studio): an android app used by **drivers** to receive orders and view order information
* **`WidyaAdmin`** (**LAMP**: Linux, Apache, MySQL, PHP): an web-based app used by the **admin** on Widya Travel agency to manage customers & drivers

## Screenshots
* **WidyaApps**
  App Launcher | Login | Register | Dashboard
  :-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:
  ![Screenshot 1](Screenshots/Widya%20Apps/Screenshot_2019-11-26-19-57-49-25.png)  |  ![Screenshot 3](Screenshots/Widya%20Apps/Screenshot_2019-11-26-20-02-55-81.png)  |  ![Screenshot 2](Screenshots/Widya%20Apps/Screenshot_2019-11-26-20-03-18-31.png)  |  ![Screenshot 4](Screenshots/Widya%20Apps/Screenshot_2019-11-26-19-57-56-32.png)
  "Car Rent" Page | "Individual Trip" Page | Order List | Order Detail (Car Rent)
  ![Screenshot 1](Screenshots/Widya%20Apps/Screenshot_2019-11-26-20-00-08-19.png)  |  ![Screenshot 3](Screenshots/Widya%20Apps/Screenshot_2019-11-26-20-01-46-87.png)  |  ![Screenshot 2](Screenshots/Widya%20Apps/Screenshot_2019-11-26-20-02-17-06.png)  |  ![Screenshot 4](Screenshots/Widya%20Apps/Screenshot_2019-11-26-20-02-28-08.png)
  Order Detail (Individual Trip) | Profil Page | Edit Profile
  ![Screenshot 1](Screenshots/Widya%20Apps/Screenshot_2019-11-26-20-02-23-35.png)  |  ![Screenshot 3](Screenshots/Widya%20Apps/Screenshot_2019-11-26-19-58-29-89.png)  |  ![Screenshot 2](Screenshots/Widya%20Apps/Screenshot_2019-11-26-19-58-36-23.png)
  
* **WidyaAdmin**
  Data Customer | Add Customer | Edit Customer
  :-------------------------:|:-------------------------:|:-------------------------:
  ![Screenshot 1](Screenshots/Widya%20Admin/1.%20Data-Customer-Dashboard-Widya-Admin.png)  |  ![Screenshot 3](Screenshots/Widya%20Admin/1.2%20Add-Customer.png)  |  ![Screenshot 2](Screenshots/Widya%20Admin/1.3%20Edit-Customer.png)
  Data Driver | Add Driver
  ![Screenshot 1](Screenshots/Widya%20Admin/2.%20Data-Driver-Dashboard-Widya-Admin.png)  |  ![Screenshot 3](Screenshots/Widya%20Admin/2.1%20Add-Driver.png)
  Rent Car Schedule | Individual Trip Schedule
  ![Screenshot 1](Screenshots/Widya%20Admin/3.%20Jadwal-Rent-Car-Dashboard-Widya-Admin.png)  |  ![Screenshot 3](Screenshots/Widya%20Admin/4.%20Jadwal-Individual-Trip-Dashboard-Widya-Admin.png)

## Demo Link
* WidyaApps
  - [**app-release.apk**](2.%20Implementation/WidyaTravel/app/release/app-release.apk)
* WidyaAdmin
  - [https://widya-travel.000webhostapp.com/admin](https://widya-travel.000webhostapp.com/admin)
  - **Note**: Use `widyaadmin@gmail.com` as email and `admin` as password

## Features

* **WidyaApps**
  * Order an individual trip travel shuttle (able to order more than 1 seat)
  * Rent a car
  * View order list & their information
  * Edit profile
* **WidyaAdmin**
  * View Customer Data
  * View Driver Data
  * Add Customer
  * Add Driver
  * Manage Customer & Driver
  * View Orders Data (Individual Trip & Car Rent)
  * Manage Orders

## Technology Used
* Android Studio
* Java Programming Language
* Object-oriented Programming
* Volley (HTTP Networking library to get data from API)
* Glide (Image library)
* PHP
* MySQL
* SB Admin 2 (from Bootstrap)

## Installation

* **WidyaApps**
  
  * You can install **WidyaApps** on your android phone by downloading the APK file in [**2. Implementation/WidyaTravel/app/release/app-release.apk**](2.%20Implementation/WidyaTravel/app/release/app-release.apk).
  * Download and open it on your android phone, and follow the installation process.

* **WidyaAdmin**

  * Setup an **Apache Web Server** & **phpMyAdmin**
  * Upload the database [**`widyatraveldb.sql`**](2.%20Implementation/WidyaAdmin/database/widyatraveldb.sql) in your **phpMyAdmin** dashboard (Open **Import** tab, and upload the file there)
  * Upload all files in [**`WidyaAdmin/website`**](2.%20Implementation/WidyaAdmin/website) folder into your web **main folder (public_html)**
  * Change database info (edit the database **host, username, and password**) on [**`db_login.php`**](2.%20Implementation/WidyaAdmin/website/db_login.php) & [**`admin/db_login.php`**](2.%20Implementation/WidyaAdmin/website/admin/db_login.php)
  * Open the website on **your-website-url.com/admin**

## Usage/ Tutorials
* WidyaApps
  Download and open video in [**Manual WidyaTravel.mp4**](3.%20Manual%20Video/Manual%20WidyaTravel.mp4) to see the instruction manual for WidyaApps
* WidyaAdmin
  Download and open video in [**Manual WidyaAdmin.mp4**](3.%20Manual%20Video/Manual%20WidyaAdmin.mp4) to see the instruction manual for WidyaAdmin

## Contributors
- [Linggar Maretva Cendani](https://github.com/LinggarM)
- [Selvi Fitria Khoerunnisa](https://github.com/selvifitria)
- Muhammad Rizky Ardhani
- Muhammad Zulpa Ladun Hakim

## Publications

[Hakim, M. Z. L., Cendani, L. M., Khoerunnisa, S. F., & Ardhani, M. R. (2019) "*Widya Travel Aplikasi Pemesanan Travel Online Berbasis Android.*" (unpublished)](4.%20Paper/Paper%20Widya%20Travel.pdf)


