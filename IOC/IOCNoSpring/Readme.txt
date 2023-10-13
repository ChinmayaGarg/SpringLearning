This example reduces tight coupling between components to some extent.
This pattern is known as factory pattern. Although, this does not implement 100% of the Inversion Of Control,
but to some extent reduces the tight coupling and achieves Inversion of Control and Dependency Injection.

Drawbacks:
In this pattern as well we have to change the code in the Vehicle class if we want to change the tyre or speaker company.
Hence, there will be certain testing we have to do, since we are disturbing certain logic inside the class.
Developer also has to write a boilerplate code, creating class for factory pattern in Vehicle class, create conditions to choose speakers and tyres, passing dependencies in factory class using JAVA code.