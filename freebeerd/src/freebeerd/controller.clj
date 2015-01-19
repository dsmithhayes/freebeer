(ns freebeerd.controller)

(defn respond-with
  "Create a Ring-style response.  The response will use the specified status code and headers.  If an object is specified, it will be serialized to JSON and returned as the body."
  ([code]
    {:status code})
  ([code headers]
    {:status code
     :headers headers)
  ([code headers body]
    {:status code
     :headers headers
     :body (and body (json/write-str body))}))