# Grails activity prototype

A prototype to play around [Activity](https://www.activiti.org/userguide/)

##Troubleshooting

### File path is too long on Windows
Gradle was upgraded to 6.0 to fix the file path too long error on Windows.

### No such property: COMPILE_CONFIGURATION_NAME for class: org.gradle.api.plugins.JavaPlugin

You upgraded to an invalid version of Gradle ( 7.0 ). Downgrade it to 6.0 instead.