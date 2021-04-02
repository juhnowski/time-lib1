(ns hello-time
  (:require [java-time :as t]))

(defn now
  "Returns the current datetime"
  []
  (t/instant))

(defn time-str
  "return a string representation"
  [instant]
  (t/format
   (t/with-zone (t/formatter "hh:mm a") (t/zone-id)) 
  instant))