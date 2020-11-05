
### Compile the code

`mvn clean install`

### build the image
`docker image build  -t  encounter-service .`

### Run the container
`docker container run -p 3444:3444 --name encounter-service -d encounter-service`
