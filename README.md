To be able to build and run docker image, please do the following steps in CMD:
1). mvn package
2). docker build -t nameofyourimage .
3). docker run -p 8080:8080 nameofyourimage
4). please use Postman to check response http://localhost:8080/api/message/get

