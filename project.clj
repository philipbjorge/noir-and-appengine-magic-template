(defproject infinite-social-wall "0.1.0-SNAPSHOT"
            :description "A hosted port of Philip Bjorge's Infinite Social Wall."
            :url "http://infinitesocialwall.appspot.com"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [noir "1.2.1"]]
            :dev-dependencies [[appengine-magic "0.5.0"]]
            :main infinite-social-wall.server)

