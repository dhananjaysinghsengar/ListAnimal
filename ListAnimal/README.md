# Getting Started

### References
Git repository url - git clone https://github.com/dhananjaysinghsengar/ListAnimal.git

### Module description
Module is responsible for fetching people data by consuming a web service and categorizing cat information based on owner's gender.

### prerequisite
- JDK 8 or higher installed on the platform where application is required to be executed
- Gradle


# Project execution steps
### Project import
- If using IDE please import using git url https://github.com/dhananjaysinghsengar/ListAnimal.git
- If you would like to download the project in your local desktop first then follow below commands - 
	- git clone https://github.com/dhananjaysinghsengar/ListAnimal.git


### Project execution
- From IDE -
		- Select the project, Go to Project -> Build Project
		- select the project and Right click, Run As -> Java Application
- From Command prompt 
		- Open Command prompt
		- Go to the location where You have saved the project and go to the main folder name (i.e. ListAnimal)
    - gradlew build
    - gradlew tasks
    - gradlew run
    
    
### Output pattern
Loggers have been set up to capture web service response and final output. Please find below a sample output- 
***********************************************************************************
Apr 06, 2020 3:47:11 PM services.ProcessAnimalInformation displayResult
INFO:

        Male
	
                Garfield
                Tom
                Max
                Jim

Apr 06, 2020 3:47:11 PM services.ProcessAnimalInformation displayResult
INFO:
        
	Female
               
	       Garfield
                Tabby
                Simba
**************************************************************************************
