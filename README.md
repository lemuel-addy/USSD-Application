# USSD-Application
An API which utilises the Javalin framework to create a USSD application by defining routes and handling various HTTP requests such as GET and POST.

# How it works
The USSD application is made up of a Request object and Response object which uses the Infobip USSD Gateway format.
Infobip's USSD gateway has APIs designed to allow third party development of applications which can receive and send USSD messages. 
It handles USSD communication between an application and the user via mobile network.

# API endpoints
<img width="825" alt="Screenshot 2023-09-25 at 7 11 27 PM" src="https://github.com/lemuel-addy/USSD-Application/assets/98181554/e7bf217f-b4aa-42d4-9be6-0850d16b6848">

The session ID is a string of characters which is generated by the gateway at the start of each USSD session.

# Request Object
This is the Request JSON object received from the gateway from users when they start a session
<img width="802" alt="Screenshot 2023-09-25 at 7 16 17 PM" src="https://github.com/lemuel-addy/USSD-Application/assets/98181554/b2bf985c-a536-4ae1-9c4e-5463eb7c14d4">

# Response Object
This is the Response JSON object sent to users after receiving a Request
<img width="803" alt="Screenshot 2023-09-25 at 7 17 50 PM" src="https://github.com/lemuel-addy/USSD-Application/assets/98181554/e66d0452-f276-43e4-a811-12baa3b9494d">

Each response sends a USSD menu where by users selection the option the want and send Request back to API with the specified menu in the HTTP POST request.
