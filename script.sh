# Resolve Mock Server Dependencies
# cp -r OTCRegression/data mock_server
# cd mock_server
# mvn dependency:resolve
# mvn spring-boot:run </dev/null &>/dev/null &
# cd ..

# Resolve Regression Test Dependencies
cd OTCRegression
mvn dependency:resolve
appium </dev/null &>/dev/null &
mvn test
# cd ..

# Start Spring-boot, appium, and regression test
# cd mock_server & mvn spring-boot:run & cd ../OTCRegression & appium & mvn test