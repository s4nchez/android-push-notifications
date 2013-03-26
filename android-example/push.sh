#!/bin/sh
curl --header "Authorization: key=AIzaSyA6-tx1UHIdB7o05kf-kIgsQtSTk0Rx8uw" \
     --header Content-Type:"application/json" \
     https://android.googleapis.com/gcm/send  \
     -d '{"registration_ids":["APA91bHEKnWET4fCgy_28gUUMsxH35Zu8sy6FRxZblKTC9HUpGvh5n-lyuS65xdm4IXhmS9_S_Q58EF5r4_Z-rkqrFwqYexcRYUhBmI1Sp10suL2cjAlFIFVyk2m7pkho3HphPVVWpQDEoZY3WHRUUACmdHlbdoSQtKeOXahBoIA3OUBEvCbO2k"],"data":{"message":"Hi from Yazino!"}}'

