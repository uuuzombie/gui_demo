# gui_demo

This is a gui demo.


# package to jar two methods
1.maven , need plugin

maven-jar-plugin
maven-assembly-plugin
ideauidesigner-maven-plugin

<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>ideauidesigner-maven-plugin</artifactId>
            <version>1.0-beta-1</version>
            <executions>
                <execution>
                    <goals>
                        <goal>javac2</goal>
                    </goals>
                </execution>
            </executions>

            <configuration>
                <fork>true</fork>
                <debug>true</debug>
                <failOnError>true</failOnError>
            </configuration>
        </plugin>
    </plugins>
</build>

and optionally - if you use GridLayoutManager or JGoodies - include also forms_rt as dependency:

<dependency>
    <groupId>com.intellij</groupId>
    <artifactId>forms_rt</artifactId>
    <version>7.0.3</version>
</dependency>

2.idea Build artifacts
File -> Project Structure -> Artifacts
create new artifact choose -> jar -> From modules with dependencies.

Next go to Build -> Build artifacts -> choose your artifact.

note:
Make sure your MANIFEST.MF is in:
src/main/resources/META_INF/
NOT
src/main/java/META_INF/


# jar to exe
exe4j

set logback file
java -Dlogback.configurationFile=logback.xml -jar gui_demo-jar-with-dependencies.jar



# make exe installer
1.Inno setup
2.NSIS

