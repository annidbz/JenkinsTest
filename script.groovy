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
         
         sh 'printenv | sort'
         
         emailext (to: 'anirudha.agnihotri96s@gmail.com', replyTo: 'anirudha.agnihotri4@gmail.com', subject: "Email Report from - '${env.JOB_NAME}' ", body: readFile("target/TestJenkins-0.0.1-SNAPSHOT.jar"), mimeType: 'jar');
}

return this