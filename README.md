# maven-project

This repository contains two maven projects (project01 & project2).

**project01** project will create non executable JAR file using following command.

```
> mvn clean install
```
**project2** project will create an executable JAR using maven-shade-plugin.

```
> mvn clean package
> java -jar target/ Project2-1.0-SNAPSHOT.jar
```

## project01

Creates a non executable **JAR** file. It contains the following dependencies.

```
<dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.10</version>
        </dependency>
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.12</version>
        </dependency>
    </dependencies>
```

## project2

Creates a executable **JAR** file using maven-shade-plugin.
```
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-shade-plugin</artifactId>
                <version>3.2.4</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>shade</goal>
                        </goals>
                        <configuration>
                            <shadedArtifactAttached>false</shadedArtifactAttached>
                            <transformers>
                                <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                    <mainClass>MainClass</mainClass>
                                </transformer>
                            </transformers>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```
