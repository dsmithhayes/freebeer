(ns freebeerd.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [freebeerd.controllers.torrents :as torrents]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]))

(defroutes app-routes
  (GET "/" req (torrents/show req))
  (POST "/" req (torrents/create req))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes api-defaults))
