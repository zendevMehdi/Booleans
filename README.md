# Booleans

This library helps to manage different paths of files or folders and normalize them easily, it supports both MS-Windows and UNIX operating systems.

## Authors

- [@Mehdi Lavasani](https://github.com/zendevMehdi)


## Features

- Convert boolean data type to integer.

## Installation

You can get jar from release section or create new project and add src folder to the project.


## Usage/Examples

Convert boolean to integer.

```java
package org.zendev.lib.path;

import java.io.File;

public class App {
    public static void main(String[] args) {
        System.out.println(Booleans.booleanToNumber(false));
    }
}
```

