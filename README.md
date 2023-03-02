# jChat-Client
A Swing client for my jChat project. The client now provides a list of connected clients on the right of the screen and has a new connection screen.
I used the NetBeans IDE with its visual designer, so expect a lot of spaghetti code.

**To run the precompiled JAR file you need at least the [v19](https://jdk.java.net/19/) of the JDK**

## Building
To build the client by yourself you'll need the [NetBeans IDE](https://netbeans.apache.org/).

Once you cloned the repository, you can open the project in NetBeans and build it by clicking the "hammer" icon in the top bar. This will generate a runnable JAR file.

If you want to compile it using a differend JDK version you'll need to change the `<maven.compiler.source>` and the `<maven.compiler.target>` variables (at line 10 and 11) in the `pom.xml` file corresponding to the installed JDK version. To check the JDK version run `java --version` in a terminal.
