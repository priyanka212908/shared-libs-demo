def call(name) {
  if (name==priya) {
pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                    hello_type("priya")
            }
        }
    }
  else if(number==56) {
        stage('build no') {
            steps {
                    number("56")
            }
        }
  }
  else (name==venkata) {
        stage('deploy') {
            steps {
                    hello_type("venkata") 
            }
        }
    }
}
  }
}
