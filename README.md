### Assignment 1: Adapter Pattern - Audio Player

#### Overview
Implement the Adapter pattern to enable a music player application to support additional audio formats (WAV and AAC) without modifying the existing player, which only supports MP3 files.

#### Structure
1. **AudioPlayer Interface**: Defines a `play(String audioType, String fileName)` method.
2. **MP3Player Class**: Implements `AudioPlayer` and can play MP3 files.
3. **WAVPlayer and AACPlayer Interfaces**: Define `playWAV` and `playAAC` methods respectively.
4. **AdvancedAudioPlayer Class**: Implements `WAVPlayer` and `AACPlayer` interfaces, capable of playing both WAV and AAC files.
5. **AudioAdapter Class**: Adapts `AdvancedAudioPlayer` to be used by `AudioPlayer`.
6. **MusicPlayerApp Class**: Demonstrates the usage of the adapter by playing various audio file formats.

#### How to Run
1. Compile and run `MusicPlayerApp.java`.
2. Observe how the application can play different audio formats seamlessly using the adapter pattern.

---

### Assignment 2: Bridge Pattern - Remote Control System

#### Overview
Utilize the Bridge pattern to create a universal remote control system for various electronic devices (TV, DVD Player, Sound System), supporting different manufacturers.

#### Structure
1. **Device Interface**: Defines `powerOn()`, `powerOff()`, `setChannel(int)`, and `setVolume(int)` methods.
2. **Concrete Device Classes**: Implement the `Device` interface for specific devices (e.g., `TVDevice`, `DVDDevice`).
3. **RemoteControl Abstract Class**: Holds a reference to a `Device` and serves as the bridge.
4. **Concrete Remote Controls**: Extend `RemoteControl`, adding specific functionalities (e.g., `BasicRemote`, `AdvancedRemote`).
5. **HomeEntertainmentSystem Class**: Demonstrates how the same remote control can work with different devices.

#### How to Run
1. Compile and run `HomeEntertainmentSystem.java`.
2. Observe the flexibility of using various remote controls with different devices.

---

### Assignment 3: Composite Pattern - Menu System

#### Overview
Implement the Composite pattern to create a hierarchical restaurant menu system where menus can contain individual menu items or other sub-menus.

#### Structure
1. **MenuComponent Abstract Class**: Contains methods like `getName()`, `getDescription()`, `getPrice()`, and `print()`.
2. **MenuItem Class**: Represents individual dishes.
3. **Menu Class**: Can contain `MenuComponent` objects, either `MenuItem` or other `Menu` objects.
4. **RestaurantApp Class**: Demonstrates building a multi-level menu and printing the entire menu structure.

#### How to Run
1. Compile and run `RestaurantApp.java`.
2. The menu hierarchy will be displayed, showing how sub-menus and items are organized.

---

### Assignment 4: Decorator Pattern - Pizza Ordering System

#### Overview
Use the Decorator pattern to create a flexible pizza ordering system that allows customers to customize their pizzas with various toppings.

#### Structure
1. **Pizza Interface**: Has methods `getDescription()` and `getCost()`.
2. **Concrete Pizza Classes**: Represent basic pizza types (e.g., `MargheritaPizza`, `VegetarianPizza`).
3. **ToppingDecorator Abstract Class**: Extends `Pizza` to add additional behavior for toppings.
4. **Concrete Topping Decorators**: Provide different toppings (e.g., `CheeseTopping`, `PepperoniTopping`).
5. **PizzaShop Class**: Demonstrates ordering a pizza with multiple toppings.

#### How to Run
1. Compile and run `PizzaShop.java`.
2. The output will show the pizza description and cost with the applied toppings.

---

### Assignment 5: Facade Pattern - Smart Home System

#### Overview
Implement a Facade to simplify controlling a smart home system with various devices like lights, thermostat, security system, and entertainment system.

#### Structure
1. **Device Classes**: Implementations for each smart device (e.g., `Light`, `Thermostat`).
2. **SmartHomeFacade Class**: Provides methods like `leaveHome()`, `arriveHome()`, `nightMode()`, and `movieMode()` for easy control.
3. **SmartHomeApp Class**: Demonstrates the simplified control provided by the facade.

#### How to Run
1. Compile and run `SmartHomeApp.java`.
2. Observe the interaction with the smart home system using the facade methods.

---

### Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor

#### Overview
Optimize a text editor's memory usage using the Flyweight pattern by sharing character objects with similar intrinsic states.

#### Structure
1. **Character Class**: Contains intrinsic state (value, font, size) and extrinsic state (position).
2. **CharacterFactory Class**: Manages the shared character flyweights.
3. **TextEditor Class**: Uses the factory to render text.
4. **TextEditorApp Class**: Demonstrates memory efficiency by inserting and rendering large amounts of text.

#### How to Run
1. Compile and run `TextEditorApp.java`.
2. The text rendering process will show the use of shared objects for repeated characters.

---

### Assignment 7: Proxy Pattern - Online Learning Platform

#### Overview
Implement the Proxy pattern to create a virtual proxy for video lectures in an online learning platform, supporting lazy loading.

#### Structure
1. **VideoLecture Interface**: Defines `getInfo()` and `play()` methods.
2. **RealVideoLecture Class**: Simulates loading and playing a video lecture.
3. **ProxyVideoLecture Class**: Implements lazy loading by only creating the real video lecture when `play()` is called.
4. **OnlineCourse Class**: Contains multiple video lectures.
5. **LearningPlatformApp Class**: Demonstrates how video lectures are loaded only when needed.

#### How to Run
1. Compile and run `LearningPlatformApp.java`.
2. Observe how video lectures are loaded only upon playing, demonstrating lazy initialization.
