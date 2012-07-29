(ns infinite-social-wall.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use infinite-social-wall.core)
  (:use [appengine-magic.servlet :only [make-servlet-service-method]]))


(defn -service [this request response]
  ((make-servlet-service-method infinite-social-wall-app) this request response))
