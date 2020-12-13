def buildApp(){
			echo "building version ${params.executeTests}"
            echo "Compile Stage"
            bat "mvn clean compile" 
}

def testApp(){
		 echo "building version ${NEW_VERSION}" 
         bat "mvn test" 
}

def deployApp(){
		
		 bat "mvn clean package" 
         echo "deploying version ${params.VERSION}"
}

return this