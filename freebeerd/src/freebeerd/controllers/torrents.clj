(ns freebeerd.controllers.torrents
    (:require [freebeerd.controller :refer [respond-with]))

(defn show
  "Returns a list of torrents as a JSON response."
  [req]
  (let [records (torrents/index )]
    (respond-with records)))