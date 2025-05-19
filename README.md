The Observer design pattern is a behavioral pattern that defines a one-to-many dependency between objects. 
When one object (the subject or publisher) changes its state, all its dependent objects (the observers or subscribers) are notified and updated automatically. 
This pattern is also known as the publish-subscribe pattern. 

Key Components

  *Subject (Publisher/Provider)*:

        Maintains a list of observers.

        Provides methods to attach (subscribe) and detach (unsubscribe) observers.

        Notifies all registered observers when its state changes

    .

  *Observer (Subscriber)*:

      Defines an interface for receiving updates from the subject.
  
      Registers and unregisters itself with the subject.
  
      Implements an update method to synchronize its state with the subject

In this example we consider a weather station.
For instance if the current weather condition changed the display elements such as **statical display element** which display the median, average weather conditions, **Overall display element** which display the overall conndition etc. must be notify and change their states as well according to the current weather change.

**Structure**
Observer interface which have the update()
Subject interface which have registerObserver(),removeObserver(),notifyObserver() 
WeatherData class implements Subject interface have setWeatherData(),changeWeatherData() and overridden above methods.
Display interface have display()
CurrentConditionDisplay which implements Display,Observer interfaces have overridden update(),display() 
