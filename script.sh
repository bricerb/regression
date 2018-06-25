# Resolve Mock Server Dependencies
cp -r OTCRegression/data mock_server
cd mock_server
mvn dependency:resolve
mvn spring-boot:run </dev/null &>/dev/null &
cd ..

# Resolve Regression Test Dependencies
cd OTCRegression
mvn dependency:resolve
lsof -i
lsof -i tcp:8080
lsof -i tcp:4723
appium & mvn test