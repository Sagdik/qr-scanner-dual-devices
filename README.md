# qr-scanner-dual-devices

# Requirement

1.Two different devices(Redmi note 5 and Emulator).

2.Two appium server which you can you directly with below command
appium -p 4723
appium -p 4724

3.Two devices which can use for QR Image and One for camera access.

4.Two App used :-

a).Gallery 
b).Bandit Scan

5.Make devices parallel to each other

# How It work:-

When you run test by using testNG.xml then app run on 2 different devices .

1 devices open Gallery and open your QR Image for scanning.

2 Devices open QR scanner and Scan the QR Image 
