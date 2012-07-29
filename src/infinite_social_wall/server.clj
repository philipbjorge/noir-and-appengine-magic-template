(ns infinite-social-wall.server
  (:require [noir.server :as server]))

(server/load-views "src/infinite_social_wall/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'infinite-social-wall})))

