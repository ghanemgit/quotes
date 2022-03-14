# Quotes (Part 1 => Lab08)

# What my project do
### My project reads the data from a file that contains json data about movie quotes using the Reader class then parse it to an array of objects (Quote). then my code select a random index between 0 and 138 (length of the array) and return the Quote object with that index.After that I print out specific properties as required, these properties is the author,likes and text.  

# Testing
### To test my project you have to change direction inside quoteApp directory.

# Cloning
### To work on my project after cloning it make sure you have Gson library, if not, add this to your dependencies in the build.gradle file, then click on gradle build button.
### // https://mvnrepository.com/artifact/com.google.code.gson/gson 
### implementation 'com.google.code.gson:gson:2.9.0'

### Important note 
### I am not sure what happened but in intelliJ test run correctly but in ubuntu I got error
![TestSuccess](assert/TestSuccess.jpg)


# Quotes (Part 2 => Lab09)

# What my project do
### My project reads the data from an online API that contains quotes in json format and show user random one at same time I added function to add this quote to local JSON file to allow us read it in no-internet case, and I write function to show offline quote in case we don't have internet connection, and this is the mechanism of this function => using the Reader class then parse it to an array of objects (Quote). then my code select a random index between 0 and 138 (length of the array) and return the Quote object with that index.After that I print out specific properties as required, these properties is the author,likes and text.  

# Testing
### In this case I render random quote from the internet how I can do test for that!!!.


### To see my solution go directly from here => [here](app/src/main/java/quotes)

### Important note I have problem in white new quote to quote.json is, the new input go directly to end of my file(out of array of object) I tried to solve that, but I cannot.