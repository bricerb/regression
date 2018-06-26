# Resolve Mock Server Dependencies
cp -a OTCRegression/data mock_server
cd mock_server
mvn dependency:resolve
mvn spring-boot:run </dev/null &>/dev/null &
cd ..

# Resolve Regression Test Dependencies
cd OTCRegression
mvn dependency:resolve
appium & mvn test