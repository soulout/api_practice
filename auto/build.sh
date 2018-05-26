#!/usr/bin/env bash

cd $(dirname $0)/..

mvn package

docker build ./  -t java_web:latest