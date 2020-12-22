def gitCheckout(){
	}


def buildApp(){
			echo "building version ${params.executeTests}"
            echo "Compile Stage"
            sh 'mvn clean compile' 
}

def testApp(){
		 echo "building version ${NEW_VERSION}" 
         sh 'mvn test' 
}

def deployApp(){
		
		 sh 'mvn clean package' 
         echo "deploying version ${params.VERSION}"
}

return this