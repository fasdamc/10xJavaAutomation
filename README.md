**How To Setup Java JDK**

1- Install intelliJ Community edition<br>
    https://www.jetbrains.com/idea/download/?section=windows<br>
2- Install JDK <br>
    https://www.oracle.com/java/technologies/downloads/#jdk23-windows<br>
3- Copy the URL for jdk C:\Program Files\Java\jdk-23<br>
4- Go to "system properties" > "environment variables" > Under "System variables", click on "New"<br>
5- Enter "JAVA_HOME" for "Variable name" and "C:\Program Files\Java\jdk-23" for "Variable value"<br>
6- Click on "OK" and close "system properties" window<br>
7- Launch IntelliJ and go to File > Settings > Version Control > GitHub and link your github account. Then, click on Apply and OK<br>
8- To select the JDK version, go to Injetllij
    File > Project Structure > Platform Settings > SDKs<br>
    Click the Add button and select the necessary option from the list of SDKs detected on your computer<br>
    Only for JDKs: if the IDE cannot find the necessary JDK on your computer automatically, click Add JDK from disk and specify its home directory in the dialog that opens. 
