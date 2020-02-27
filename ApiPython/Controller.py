from flask import Flask
from flask_restful import Resource, Api
import json
import time

app = Flask(__name__)
api = Api(app)

class Foo(object):
    def __init__(self):
        self.testName = 'PYTHON'
        self.content = 'Test jakis tam'
        self.author = 'Andrzej Sapkowski'

foo = Foo()


class getResponse(Resource):
    def get(self):
        time.sleep(200)
        return json.dumps(foo.__dict__)


api.add_resource(getResponse, '/all') # Route_1


if __name__ == '__main__':
    app.run(port='8881')