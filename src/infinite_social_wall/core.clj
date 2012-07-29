;; App Definition
(ns infinite-social-wall.core
  (:require [appengine-magic.core :as ae]
            [noir.util.gae :as noir-ae])
  (:use [ring.middleware params]))


;; Views should go here
(require 'infinite-social-wall.views.welcome)

;; Appengine compatible noir handler
(ae/def-appengine-app infinite-social-wall-app 
  (noir-ae/gae-handler nil))
