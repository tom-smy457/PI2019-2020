#include "Controller.h"

BasicController::BasicController(const std::string& naddress, const std::string& nport) {
	this->endpointBuilder.set_host(naddress);
	this->endpointBuilder.set_port(nport);
	this->endpointBuilder.set_scheme("http");
}
BasicController::~BasicController() {
}
void BasicController::setEndpoint(const std::string& mount_point)
{
	endpointBuilder.set_path(mount_point);
	_listener = http_listener(endpointBuilder.to_uri());
}