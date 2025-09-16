class SmartDevice{
    varible - deviceName
    then created the constructor for the variable
    then generated geter and seter 
    this is the abstract class so created the abstarct method - performFunction()
}

class Light{
    this class extends from the SmartDevice
    variables - brightnessLevel
    generated the setmethod for brightnesslevel
    override the performFunction() to print the device name and brightnesslevel
}

class Thermostat{
    this class is extends from the Smartdevice
    then generated the seter for temparture
    override the performFunction()
}

class Room{
    varible - roomname
    generated the constructor for the varibales
    then created the method to show the room devices (to print the room and device)
    then created the method to control the devices (to call the performfunction)
}

class house{
    fields - room1,room2
    to generated the constructor for the both room
    created the method to showall device and controlall device
}

class Main{
    create the objects for reqired rooms 
    call the methods to show all deviece and perform functions
}