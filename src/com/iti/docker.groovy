package com.iti;

def build(IMAGE_NAME, IMAGE_TAG){
    sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
}

def login(USERNAME, PASSWORD){
    sh """
        echo "${PASSWORD}" | docker login -u "${USERNAME}" --password-stdin
    """
}


def push(IMAGE_NAME, IMAGE_TAG){
    sh "docker push ${IMAGE_NAME}:${IMAGE_TAG}"
}
